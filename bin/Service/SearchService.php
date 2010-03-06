<?php

class Service_SearchService extends PhpBuf_RPC_Socket_Service_Client {
    public function __construct($host, $port){
        parent::__construct($host, $port);
        $this->setServiceFullQualifiedName('com.github.nowelium.phpbuf.SearchService');
        $this->registerMethodResponderClass('search', Message_Response_SearchResult::name());
    }
}