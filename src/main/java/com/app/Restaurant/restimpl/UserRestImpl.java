package com.app.Restaurant.restimpl;

import com.app.Restaurant.constents.RestaurantConstant;
import com.app.Restaurant.rest.UserRest;
import com.app.Restaurant.service.UserService;
import com.app.Restaurant.utils.RestaurantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            return userService.signUp(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return RestaurantUtils.getResponseEntity(RestaurantConstant.SOMETHING_WENT_WRONG,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
