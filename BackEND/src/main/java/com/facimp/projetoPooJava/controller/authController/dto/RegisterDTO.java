package com.facimp.projetoPooJava.controller.authController.dto;

import com.facimp.projetoPooJava.model.modelUser.UserRole;

public record RegisterDTO (String login, String password, UserRole role){

}
