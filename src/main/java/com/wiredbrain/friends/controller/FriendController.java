package com.wiredbrain.friends.controller;

import com.wiredbrain.friends.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendController {

    @Autowired
    FriendService friendService;

}
