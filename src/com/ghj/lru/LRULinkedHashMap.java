package com.ghj.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMap {
    public class lru<k,v> extends LinkedHashMap<k,v> {
        private final int cache_Size;
        public lru(int cache){
            super((int) Math.ceil(cache/0.75)+1,0.75f,true);
            cache_Size = cache;
        }
        protected boolean removeEldestEntry(Map.Entry<k,v> eldest){
            return size() > cache_Size;
        }
    }
}
