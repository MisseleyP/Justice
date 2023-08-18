package com.example.jwtexample.Service;

import com.example.jwtexample.Entity.Role;
import com.example.jwtexample.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleByName(String roleName) {
        return roleRepository.findById(roleName).orElse(null);
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

//    public Role updateRole(String roleName, Role updatedRole) {
//        if (roleRepository.existsById(roleName)) {
//            updatedRole.setRoleName(roleName);
//            return roleRepository.save(updatedRole);
//        }
//        return null;
//    }

    public void deleteRole(String roleName) {
        roleRepository.deleteById(roleName);
    }
}

