package RestAssuredAPIUsingPOJO;

public class oAuthFormParameters {
String clinet_id;
String client_secret;
String grant_type;

public oAuthFormParameters(String client_id,String client_secret,String grant_type) {
	client_id=this.clinet_id;
	client_secret=this.client_secret;
	grant_type=this.grant_type;
	
	
}
public String getClinet_id() {
	return clinet_id;
}
public void setClinet_id(String clinet_id) {
	this.clinet_id = clinet_id;
}
public String getClient_secret() {
	return client_secret;
}
public void setClient_secret(String client_secret) {
	this.client_secret = client_secret;
}
public String getGrant_type() {
	return grant_type;
}
public void setGrant_type(String grant_type) {
	this.grant_type = grant_type;
}

}
