package com.bankapplication.bankapplication.Model;

import com.bankapplication.bankapplication.Types.RoleType;
import lombok.Data;

@Data
public class RoleToCustomer {

    private Long customerId;
    private RoleType role;

}
