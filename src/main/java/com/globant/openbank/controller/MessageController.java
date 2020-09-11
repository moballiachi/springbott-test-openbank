package com.globant.openbank.controller;


import java.util.List;

import com.globant.openbank.beans.GloberManager;
import com.globant.openbank.beans.GloberReply;
import com.globant.openbank.beans.IMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class MessageController {

    @RequestMapping(method = RequestMethod.GET, value="/glober/allmessage")
    public @ResponseBody List<IMessage> getAllStudents() {
        return GloberManager.getInstance().getMessages();
    }

    @RequestMapping(method = RequestMethod.POST, value="/glober/add")
    public @ResponseBody GloberReply registerMessage(@RequestBody String messageInput) {
        System.out.println("In request ... ");
        GloberReply responde = new GloberReply();
        GloberManager.getInstance().add(messageInput);
        responde.setMessage("Successfull registred ... ");
        return responde;
    }
}
