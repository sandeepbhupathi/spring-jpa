package com.sandeep.repo;

import com.sandeep.model.Currency;
import com.sandeep.model.id.CurrencyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency,CurrencyId> {

    //Currency find(Class<Currency> currencyClass, CurrencyId currencyId);
}

