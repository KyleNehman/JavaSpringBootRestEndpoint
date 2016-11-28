package endpoint;

/*
 * A Java translation of the groovy ObjController class
 * handles the process of POSTing a JSON to a POJO, and
 * then outputing another POJO as a JSON
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;

@RestController
@RequestMapping("/")
public class ObjController {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<OutputObj> update(@RequestBody InputObj obj) {
        
	// defines a new OutputObj to return
	OutputObj returnVal = new OutputObj();

	// old data members from input obj
	String userUUID = obj.getUserUUID();
	String taskUUID = obj.getTaskUUID();
	String postXORStr = obj.xorString();

	// and setting the returnVal obj's members
	returnVal.setUserUUID(userUUID);
	returnVal.setTaskUUID(taskUUID);
	returnVal.setBase64Str(postXORStr);

	return new ResponseEntity<OutputObj>(returnVal, HttpStatus.OK);
    }
}
