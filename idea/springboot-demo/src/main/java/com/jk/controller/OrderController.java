package com.jk.controller;

import com.jk.entity.OrderPojo;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {

    @Resource
    private OrderService  orderService;

     @RequestMapping("/")
     public  String  index(){
         return  "redirect:/orderList";
     }

     @RequestMapping("/orderList")
     public   String   orderList(Model model){
         List<OrderPojo> list = orderService.findAll();
         model.addAttribute("order",list);
         return  "order/orderList";
     }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "order/orderAdd";
    }

    @RequestMapping("/add")
    public String add(OrderPojo order) {
        orderService.save(order);
        return "redirect:/orderList";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) {
        OrderPojo order = orderService.findOrderPojoById(id);
        model.addAttribute("order", order);
        return "order/orderEdit";
    }

    @RequestMapping("/edit")
    public String edit(OrderPojo order) {
        orderService.update(order);
        return "redirect:/orderList";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        orderService.deleteById(id);
        return "redirect:/orderList";
    }

}
