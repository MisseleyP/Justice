package com.example.jwtexample.Controller;

import com.example.jwtexample.Entity.Role;
import com.example.jwtexample.Service.RoleService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/{roleName}")
    public Role getRoleByName(@PathVariable String roleName) {
        return roleService.getRoleByName(roleName);
    }

    @PostMapping("/{createRole}")
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

//    @PutMapping("/{roleName}")
//    public Role updateRole(@PathVariable String roleName, @RequestBody Role updatedRole) {
//        return roleService.updateRole(roleName, updatedRole);
//    }

    @DeleteMapping("/{deleteRole}")
    public void deleteRole(@PathVariable String roleName) {
        roleService.deleteRole(roleName);
    }
}

