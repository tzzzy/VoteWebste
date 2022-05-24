package com.boc.votewebsite.service;

import com.boc.votewebsite.entity.Staff;
import com.boc.votewebsite.mapper.StaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffMapper staffMapper;
    public List<Staff> matchStaffIdPassword(Integer staffId, String password){
        return staffMapper.findByStaffIdPassword(staffId, password);
    }
}
