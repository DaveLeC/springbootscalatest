package dave.lecomte.factor;

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController};

@RestController
@RequestMapping(path = Array("/api"))
class UserController {
  @GetMapping(path = Array("/users"))
  def getUser(): String = {
    "userService.listUsers"
  }

}