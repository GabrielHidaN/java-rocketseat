package br.com.gabrielhidan.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
/*
 * body
 */

@RestController
@RequestMapping("/users")
public class UserController {
    

    /*
     * String(texto)
     * interger (int) numeros inteiros
     * Double números 9.0000
     * float números 9.0000
     * char (A C)
     * Date (data)
     * void
     * */
    @PostMapping("/")
    public  void create(@RequestBody UserModel usermodel){
        System.out.println(usermodel.name);
    }
}
