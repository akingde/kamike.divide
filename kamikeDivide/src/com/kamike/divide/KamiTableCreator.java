/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kamike.divide;

import com.kamike.db.GenericCreator;
import com.kamike.db.Transaction;
import com.kamike.db.generic.GenericCreate;

/**
 *
 * @author THiNk
 */
public class KamiTableCreator extends GenericCreator<KamiTable> {

    public KamiTableCreator(Transaction ts,String dbName) {
        super(ts,dbName);
    }

    @Override
    public GenericCreate<KamiTable> newCreate() {

        return new KamiTableCreate();
    }
    

}
