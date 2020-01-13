package com.project.suppliercontactstoragethymeleaf.controller;

import com.project.suppliercontactstoragethymeleaf.entity.Supplier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {

    // load supplier data
    private List<Supplier> theSupplier;

    @PostConstruct
    private void loadData() {
        // create suppliers
        Supplier supplier1 = new Supplier(1,"www.china-qiyuan.com","Daniel","sales3@china-qiyuan.com","Ningxia Qiyuan Pharmaceutical Co., Ltd","ascorbic acid");
        Supplier supplier2 = new Supplier(2,"www.chnattwr.cn","Lily","sales6@chinattwr.com","SHANDONG TONGTAI WEIRUN CHEMICAL CO.,LTD","Sodium Benzoate");
        Supplier supplier3 = new Supplier(3,"www.chinafooding.com","Lily","sales60@chinafooding.com","Fooding Group Limited","Creatine Monogydrate");

        // add to the List
        theSupplier = new ArrayList<>();
        theSupplier.add(supplier1);
        theSupplier.add(supplier2);
        theSupplier.add(supplier3);
    }

    // mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // add to model
        theModel.addAttribute("suppliers",theSupplier);

        return "list-suppliers";
    }
}
