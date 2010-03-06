<?php

require dirname(__FILE__) . '/../../lib/php-protobuf/lib/PhpBuf.php';

require 'Message/Request_SearchRequest.php';
require 'Message/Response_SearchResult.php';
require 'Message/Web_Site.php';
require 'Message/Web_SiteType.php';

require 'Service/SearchService.php';

$request = new Message_Request_SearchRequest;
$request->query = 'hello world';

$service = new Service_SearchService('localhost', 12345);
$result = $service->search($request);

foreach($result->sites as $site){
    echo 'title => ', $site->title, PHP_EOL;
    echo 'url => ', $site->url, PHP_EOL;
    echo 'type => ', $site->type, PHP_EOL;
    echo PHP_EOL;
}
