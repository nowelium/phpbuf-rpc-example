<?php

class Message_Response_SearchResult extends PhpBuf_Message_Abstract {
    public function __construct(){
        $this->setField('sites', PhpBuf_Type::MESSAGE, PhpBuf_Rule::REPEATED, 1, Message_Web_Site::name());
    }
    public static function name(){
        return __CLASS__;
    }
}