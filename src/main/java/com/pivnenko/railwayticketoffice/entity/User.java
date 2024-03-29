package com.pivnenko.railwayticketoffice.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Integer id;

        //private String fullName;

        private String login;

        private String password;

        private String email;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

//        public String getFullName() {
//            return fullName;
//        }
//
//        public void setFullName(String fullName) {
//            this.fullName = fullName;
//        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
}
