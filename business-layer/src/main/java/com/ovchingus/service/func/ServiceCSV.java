package com.ovchingus.service.func;

import com.ovchingus.persistence.CSV.model.ProductEntityCSV;
import com.ovchingus.persistence.CSV.model.StoreEntityCSV;
import com.ovchingus.persistence.DaoFactory;
import com.ovchingus.persistence.GenericDao;

import java.util.List;
import java.util.Map;

public class ServiceCSV implements ServiceMethods {

    private GenericDao daoStoreEntity = DaoFactory.getDao(StoreEntityCSV.class);

    private GenericDao daoProductEntity = DaoFactory.getDao(ProductEntityCSV.class);


    @Override
    public void createStore(String store) {

    }

    @Override
    public void createProduct(String product) {

    }

    @Override
    public List<String> createShopList(List<String> list) {
        return null;
    }

    @Override
    public void insertProductListToStore(String store, String list) {

    }

    @Override
    public String findStoreWithCheapestProduct(String product) {
        return null;
    }

    @Override
    public Map<String, Integer> findProductListForSum(Double budget) {
        return null;
    }

    @Override
    public Integer buyListOfProductsInOneStore(String store, Map<String, Integer> map) {
        return null;
    }

    @Override
    public String findStoreWithCheapestShopList(Map<String, Integer> map) {
        return null;
    }
}
