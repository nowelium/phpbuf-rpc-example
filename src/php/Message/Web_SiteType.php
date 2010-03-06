<?php

class Message_SiteType extends Message_Enum_Abstract {

    const BLOG = 0;
    const NEWS = 1;
    const VIDEO = 2;
    const UNKNOWN = 3;
    
    public static function values(){
        return array(
            self::BLOG,
            self::NEWS,
            self::VIDEO,
            self::UNKNOWN
        );
    }
}