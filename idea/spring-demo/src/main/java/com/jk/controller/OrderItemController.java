package com.jk.controller;

import com.jk.entity.OrderItem;
import com.jk.service.OrderItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderItemController {


    @Resource
    private OrderItemService   orderItemService;

    @RequestMapping("/")
    public  String  index(){
        return  "redirect:/orderItemList";
    }

    @RequestMapping("/orderItemList")
    public   String   orderItemList(Model model){
        List<OrderItem> list = orderItemService.findAll();
        model.addAttribute("orderItem",list);
        return  "orderItem/orderItemList";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "orderItem/orderItemAdd";
    }

    @RequestMapping("/add")
    public String add(OrderItem orderItem) {
        orderItemService.save(orderItem);
        return "redirect:/orderItemList";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        OrderItem orderItem = orderItemService.findOrderItemById(id);
        model.addAttribute("orderItem", orderItem);
        return "orderItem/orderItemEdit";
    }

    @RequestMapping("/edit")
    public String edit(OrderItem orderItem) {
        orderItemService.update(orderItem);
        return "redirect:/orderItemList";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        orderItemService.deleteById(id);
        return "redirect:/orderItemList";
    }
}
