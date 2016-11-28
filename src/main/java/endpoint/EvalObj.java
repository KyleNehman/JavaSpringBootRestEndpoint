package endpoint;

/*
 * A Java translation of the base EvalObj object
 * Contains getters and setters for the 3 private members
 */

public class EvalObj {

    private String userUUID;	// userUUID from JSON input
    private String taskUUID;	// taskUUID from JSON input
    protected String base64Str;	// A base 64 string

    public String getTaskUUID() {
	return this.taskUUID;
    }
    
    public void setTaskUUID(String newUUID) {
	this.taskUUID = newUUID;
    }

    public String getUserUUID() {
	return this.userUUID;
    }

    public void setUserUUID(String newUUID) {
	this.userUUID = newUUID;
    }

    public String getBase64Str() {
	return this.base64Str;
    }

    public void setBase64Str(String newStr) {
	this.base64Str = newStr;
    }
}
