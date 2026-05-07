@RestController
public class MsgController {
	
	private Logger log = LoggerFactory.getLogger(MsgController.class);

@GetMapping("/msg")
public String getMsg() {
 log.info("******** getMsg() - executtion started ********");
		String msg = "Welcome To DataTech";
 log.info("******** getMsg() - executtion completed ********");
		return msg;
	}
}
