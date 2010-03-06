<?php

class Message_Web_Site extends PhpBuf_Message_Abstract {
    public function __construct(){
        $this->setField('url', PhpBuf_Type::STRING, PhpBuf_Rule::REQUIRED, 1);
        $this->setField('title', PhpBuf_Type::STRING, PhpBuf_Rule::REQUIRED, 2);
        $this->setField('type', PhpBuf_Type::ENUM, PhpBuf_Rule::REQUIRED, 3, Message_SiteType::values());
        $this->setField('summary', PhpBuf_Type::STRING, PhpBuf_Rule::OPTIONAL, 4);
    }
    public static function name(){
        return __CLASS__;
    }
}