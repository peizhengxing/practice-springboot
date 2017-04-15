package cn.chapter;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages="cn.chapter.es.repository")
public class ElasticSearchConfiguration {
	
//	@Autowired
//	private Environment env;

	@Bean
	public Client client() throws NumberFormatException, UnknownHostException {
		Map<String,String> map = new HashMap<>();
		map.put("client.transport.ping_timeout", "120s");
		TransportAddress address = new InetSocketTransportAddress(InetAddress.getByName("192.168.2.251"),Integer.parseInt("9300"));
		// Client client = TransportClient.builder().settings(setting).build().addTransportAddress(address);
		TransportClient client = new TransportClient();
		client.addTransportAddress(address);
		return client;
	}
	
	@Bean
    public ElasticsearchOperations elasticsearchTemplate() throws NumberFormatException, UnknownHostException {
        return new ElasticsearchTemplate(client());
    }
}
