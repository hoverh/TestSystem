package com.Dao;

import com.Entity.Single;

import java.util.List;

public interface QuestionDao {
    List<Single> queryPaperSingle(String paper);

    List<String> queryPaperList();
}
