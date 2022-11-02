package com.cts.prod.management.model;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class AuditDetail {
	private String action;
	private String AuditMessage;
	private String auctionEntity;
	
	
	
	public AuditDetail() {
		super();
	}
	
	
	
	public AuditDetail(String action, String auditMessage, String auctionEntity) {
		super();
		this.action = action;
		AuditMessage = auditMessage;
		this.auctionEntity = auctionEntity;
	}



	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAuditMessage() {
		return AuditMessage;
	}
	public void setAuditMessage(String auditMessage) {
		AuditMessage = auditMessage;
	}
	public String getAuctionEntity() {
		return auctionEntity;
	}
	public void setAuctionEntity(String auctionEntity) {
		this.auctionEntity = auctionEntity;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AuditMessage == null) ? 0 : AuditMessage.hashCode());
		result = prime * result + ((action == null) ? 0 : action.hashCode());
		result = prime * result + ((auctionEntity == null) ? 0 : auctionEntity.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuditDetail other = (AuditDetail) obj;
		if (AuditMessage == null) {
			if (other.AuditMessage != null)
				return false;
		} else if (!AuditMessage.equals(other.AuditMessage))
			return false;
		if (action == null) {
			if (other.action != null)
				return false;
		} else if (!action.equals(other.action))
			return false;
		if (auctionEntity == null) {
			if (other.auctionEntity != null)
				return false;
		} else if (!auctionEntity.equals(other.auctionEntity))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AuditDetail [action=" + action + ", AuditMessage=" + AuditMessage + ", auctionEntity=" + auctionEntity
				+ "]";
	}
	
	
	
	
	
}
