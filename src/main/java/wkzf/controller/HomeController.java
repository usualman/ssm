package wkzf.controller;


// 注解标注此类为springmvc的controller，url映射为"/home"


    @Controller
 public class HomeController {

        @RequestMapping("/helloworld")
        public String hello(){
               System.out.println("hello world");
                return "success";
           }
     }