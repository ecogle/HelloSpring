package pkgone;

public class SecurityLevel {

	private long securityId;
	private enum AccessLevel{
		TOP_SECRET,
		SECRET,
		CONFIDENTIAL,
		PROPRIETARY
	}
	private AccessLevel levelOfAccess;
	
}
