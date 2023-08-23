package com.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        SpringApplication.run(Test1Application.class, args);
    }

    @PostMapping("/add")
    public int sumNumbers(@RequestBody Numbers numbers){
        int num1 = numbers.getNum1();
        int num2 = numbers.getNum2();
        return num1 + num2;
    }

    public static class Numbers{
        private int num1;
        private int num2;

        public int getNum1(){
            return num1;
        }

        public void setNum1(int num1){
            this.num1 = num1;
        }

        public int getNum2(){
            return num2;
        }

        public void setNum2(int num2){
            this.num2 = num2;
        }
    }


}
