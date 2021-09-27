package com.ywz.service.impl;

import com.ywz.dao.SalaryDao;
import com.ywz.entity.Salary;
import com.ywz.service.SalaryService;

import java.util.List;

public class SalaryServiceImpl extends BaseServiceImpl<SalaryDao,Salary> implements SalaryService {
    public SalaryServiceImpl(SalaryDao salaryDao) {
        super(salaryDao);
    }
}
