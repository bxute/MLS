
class StatuModel {

	public String comment;
	public String aspectRatio;
	public int duration;
	public String syndicate;
	public String list;
	public String rate;
	public String reason;
	public String commentVote;
	public String value;
	public int ratingCount;
	public int viewCount;
	public int favoriteCount;

	public StatuModel(String comment, String aspectRatio, int duration, String syndicate, String list, String rate, String reason, String commentVote, String value, int ratingCount, int viewCount, int favoriteCount) {

		this.comment = comment;
		this.aspectRatio = aspectRatio;
		this.duration = duration;
		this.syndicate = syndicate;
		this.list = list;
		this.rate = rate;
		this.reason = reason;
		this.commentVote = commentVote;
		this.value = value;
		this.ratingCount = ratingCount;
		this.viewCount = viewCount;
		this.favoriteCount = favoriteCount;

	}

}