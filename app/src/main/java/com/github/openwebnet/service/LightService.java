package com.github.openwebnet.service;

import com.github.openwebnet.model.LightModel;

import java.util.List;

import rx.Observable;

public interface LightService {

    Observable<String> add(LightModel light);

    Observable<Void> update(LightModel light);

    Observable<Void> delete(String uuid);

    Observable<LightModel> findById(String uuid);

    Observable<List<LightModel>> findAll();

    Observable<List<LightModel>> findByEnvironment(Integer id);

    Observable<List<LightModel>> requestByEnvironment(Integer id);

    Observable<LightModel> turnOn(LightModel light);

    Observable<LightModel> turnOff(LightModel light);

}
