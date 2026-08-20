class Twitter {

    private static class Tweet {
        int id;
        int time;

        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    private Map<Integer, List<Tweet>> tweets;
    private Map<Integer, Set<Integer>> following;
    private int time;

    public Twitter() {
        tweets = new HashMap<>();
        following = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {

        tweets.putIfAbsent(userId, new ArrayList<>());

        tweets.get(userId).add(new Tweet(tweetId, time++));
    }

    public List<Integer> getNewsFeed(int userId) {

        List<Integer> result = new ArrayList<>();

        PriorityQueue<Tweet> maxHeap =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(b.time, a.time)
            );

        // User's own tweets
        if (tweets.containsKey(userId)) {
            for (Tweet tweet : tweets.get(userId)) {
                maxHeap.offer(tweet);
            }
        }

        // Followed users' tweets
        if (following.containsKey(userId)) {

            for (int followee : following.get(userId)) {

                if (tweets.containsKey(followee)) {

                    for (Tweet tweet : tweets.get(followee)) {
                        maxHeap.offer(tweet);
                    }
                }
            }
        }

        // Get 10 most recent
        while (!maxHeap.isEmpty() && result.size() < 10) {
            result.add(maxHeap.poll().id);
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {

        if (followerId == followeeId)
            return;

        following
            .computeIfAbsent(followerId, k -> new HashSet<>())
            .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}