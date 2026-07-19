package com.dormproject.smartDormProject.repository;

import java.util.List;

import com.dormproject.smartDormProject.entity.Dorms;
import com.dormproject.smartDormProject.entity.ResponseBox;

public interface DormsDAO {
    ResponseBox insert(Dorms dorms);
    ResponseBox delete(Integer id);
    Dorms getDorms(Integer id);
    List<Dorms> getAll();
    ResponseBox update (Dorms dorms);
}
