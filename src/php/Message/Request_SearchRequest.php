<?php

class Message_Request_SearchRequest extends PhpBuf_Message_Abstract {
    public function __construct(){
        $this->setField('query', PhpBuf_Type::STRING, PhpBuf_Rule::REQUIRED, 1);
    }
    public static function name(){
        return __CLASS__;
    }
}