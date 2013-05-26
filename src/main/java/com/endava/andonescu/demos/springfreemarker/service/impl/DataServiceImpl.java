/**
 *
 */
package com.endava.andonescu.demos.springfreemarker.service.impl;

import com.endava.andonescu.demos.springfreemarker.service.DataService;
import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author iandonescu
 */
@Service
public class DataServiceImpl implements DataService {

    /* (non-Javadoc)
     * @see com.endava.andonescu.demos.springfreemarker.service.DataService#getCounties()
     */
    public List<String> getCounties() {
        return ImmutableList.of("Iasi", "Neamt", "Bucuresti");
    }
}
