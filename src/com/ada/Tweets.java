/**
 * 
 */
package com.ada;

public class Tweets {

	private String text;
	private String isFavorited;
	private String favoriteCount;
	private String replyToSN;
	private String created;
	private String isTruncated;
	private String replyToSID;
	private String id;
	private String replyToUID;
	private String statusSource;
	private String screenName;
	private String retweetCount;
	private String isRetweet;
	private String isRetweeted;
	private String longitude;
	private String latitute;
	
	//return the text
	public String getText() {
		return text;
	}
	
	//for the text to set
	public void setText(String text) {
		this.text = text;
	}

	 //return the isFavorited
	public String getIsFavorited() {
		return isFavorited;
	}
	
    //for the isFavorited to set
	public void setIsFavorited(String isFavorited) {
		this.isFavorited = isFavorited;
	}
	//return the favoriteCount
	public String getFavoriteCount() {
		return favoriteCount;
	}
	
	//for the favoriteCount to set
	public void setFavoriteCount(String favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	
	//return the replyToSN
	public String getReplyToSN() {
		return replyToSN;
	}
	
	//for the replyToSN to set
	 
	public void setReplyToSN(String replyToSN) {
		this.replyToSN = replyToSN;
	}

	//return the created
	 	public String getCreated() {
		return created;
	}
	
	 	//for the created to set
	public void setCreated(String created) {
		this.created = created;
	}
	
	//return the isTruncated
	public String getIsTruncated() {
		return isTruncated;
	}

	//for the isTruncated to set
	public void setIsTruncated(String isTruncated) {
		this.isTruncated = isTruncated;
	}

	//return the replyToSID
	public String getReplyToSID() {
		return replyToSID;
	}

	//for the replyToSID to set
	public void setReplyToSID(String replyToSID) {
		this.replyToSID = replyToSID;
	}
	
	//return the id
	public String getId() {
		return id;
	}
	//for the id to set
	public void setId(String id) {
		this.id = id;
	}

	//return the replyToUID
	public String getReplyToUID() {
		return replyToUID;
	}
	
	//for the replyToUID to set
	public void setReplyToUID(String replyToUID) {
		this.replyToUID = replyToUID;
	}

	//return the statusSource
	public String getStatusSource() {
		return statusSource;
	}
	
	//for the statusSource to set
	public void setStatusSource(String statusSource) {
		this.statusSource = statusSource;
	}
	
	//return the screenName
	public String getScreenName() {
		return screenName;
	}

	//for the screenName to set
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	//return the retweetCount
	public String getRetweetCount() {
		return retweetCount;
	}

	//for the retweetCount to set
	public void setRetweetCount(String retweetCount) {
		this.retweetCount = retweetCount;
	}
	
	//return the isRetweet
	public String getIsRetweet() {
		return isRetweet;
	}
	
	//for the isRetweet to set
	 
	public void setIsRetweet(String isRetweet) {
		this.isRetweet = isRetweet;
	}

	//return the isRetweeted
	public String getIsRetweeted() {
		return isRetweeted;
	}
	
	 //for the isRetweeted to set 
	public void setIsRetweeted(String isRetweeted) {
		this.isRetweeted = isRetweeted;
	}
	
	 //return the longitude
	public String getLongitude() {
		return longitude;
	}
	
	//for the longitude to set
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	//return the latitute
	public String getLatitute() {
		return latitute;
	}

	//for the latitute to set
	public void setLatitute(String latitute) {
		this.latitute = latitute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((favoriteCount == null) ? 0 : favoriteCount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isFavorited == null) ? 0 : isFavorited.hashCode());
		result = prime * result + ((isRetweet == null) ? 0 : isRetweet.hashCode());
		result = prime * result + ((isRetweeted == null) ? 0 : isRetweeted.hashCode());
		result = prime * result + ((isTruncated == null) ? 0 : isTruncated.hashCode());
		result = prime * result + ((latitute == null) ? 0 : latitute.hashCode());
		result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((replyToSID == null) ? 0 : replyToSID.hashCode());
		result = prime * result + ((replyToSN == null) ? 0 : replyToSN.hashCode());
		result = prime * result + ((replyToUID == null) ? 0 : replyToUID.hashCode());
		result = prime * result + ((retweetCount == null) ? 0 : retweetCount.hashCode());
		result = prime * result + ((screenName == null) ? 0 : screenName.hashCode());
		result = prime * result + ((statusSource == null) ? 0 : statusSource.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tweets other = (Tweets) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (favoriteCount == null) {
			if (other.favoriteCount != null)
				return false;
		} else if (!favoriteCount.equals(other.favoriteCount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isFavorited == null) {
			if (other.isFavorited != null)
				return false;
		} else if (!isFavorited.equals(other.isFavorited))
			return false;
		if (isRetweet == null) {
			if (other.isRetweet != null)
				return false;
		} else if (!isRetweet.equals(other.isRetweet))
			return false;
		if (isRetweeted == null) {
			if (other.isRetweeted != null)
				return false;
		} else if (!isRetweeted.equals(other.isRetweeted))
			return false;
		if (isTruncated == null) {
			if (other.isTruncated != null)
				return false;
		} else if (!isTruncated.equals(other.isTruncated))
			return false;
		if (latitute == null) {
			if (other.latitute != null)
				return false;
		} else if (!latitute.equals(other.latitute))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (replyToSID == null) {
			if (other.replyToSID != null)
				return false;
		} else if (!replyToSID.equals(other.replyToSID))
			return false;
		if (replyToSN == null) {
			if (other.replyToSN != null)
				return false;
		} else if (!replyToSN.equals(other.replyToSN))
			return false;
		if (replyToUID == null) {
			if (other.replyToUID != null)
				return false;
		} else if (!replyToUID.equals(other.replyToUID))
			return false;
		if (retweetCount == null) {
			if (other.retweetCount != null)
				return false;
		} else if (!retweetCount.equals(other.retweetCount))
			return false;
		if (screenName == null) {
			if (other.screenName != null)
				return false;
		} else if (!screenName.equals(other.screenName))
			return false;
		if (statusSource == null) {
			if (other.statusSource != null)
				return false;
		} else if (!statusSource.equals(other.statusSource))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
}
