package baibao.action.ai.support.aliyun;

import com.alibaba.fastjson.JSON;
import kunlun.action.ActionUtils;
import kunlun.action.ai.model.ChatRequest;
import kunlun.action.ai.model.ChatResponse;
import kunlun.action.ai.model.EmbedRequest;
import kunlun.action.ai.model.EmbedResponse;
import kunlun.core.function.Consumer;
import kunlun.data.json.JsonUtils;
import kunlun.data.json.support.FastJsonHandler;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static kunlun.action.ai.model.Message.SYSTEM;
import static kunlun.action.ai.model.Message.USER;
import static kunlun.common.constant.Symbols.DOT;

@Ignore
public class AliYunQwenAIActionTest {
    private static final Logger log = LoggerFactory.getLogger(AliYunQwenAIActionTest.class);
    private static final String handlerName = "qwen";
    private static final String embedModel = "text-embedding-v3";
    private static final String chatModel = "qwen-max-0919";

    static {
        JsonUtils.registerHandler("default", new FastJsonHandler());
        ActionUtils.registerAction(handlerName, new AbstractAliYunQwenAIAction() {
            @Override
            protected Config getConfig(String strategy, Object input) {
                Config config = new Config();
                config.setApiKey("sk-aaaa");
                config.setDebug(true);
                return config;
            }
        });
    }

    @Test
    public void testChat() {
        ChatRequest request = ChatRequest.Builder.of(chatModel)
//                .setTemperature(1.9)
                .addMessage(SYSTEM, "You are a helpful assistant.")
                .addMessage(USER, "what is AI?")
                .build();
        String command = handlerName + DOT + "chat";
        ChatResponse response = ActionUtils.execute(command, request);
        log.info("result: {}", JSON.toJSONString(response, Boolean.TRUE));
    }

    @Test
    public void testChat1() {
        ChatRequest request = ChatRequest.Builder.of(chatModel)
//                .setTemperature(1.9)
                .setStream(true)
                .addMessage(SYSTEM, "You are a helpful assistant.")
                .addMessage(USER, "what is AI?")
                .setStreamConsumer(new Consumer<Object>() {
                    @Override
                    public void accept(Object param) {
                        String line = String.valueOf(param);
                        System.out.println(line);
                    }})
                .build();
        String command = handlerName + DOT + "chat";
        ActionUtils.execute(command, request);
    }

    @Test
    public void testEmbeddings() {
        EmbedRequest request = EmbedRequest.Builder.of(embedModel)
                .setEncodingFormat("float")
                .setInput("this is a test")
                .build();
        String command = handlerName + DOT + "embeddings";
        EmbedResponse execute = ActionUtils.execute(command, request);
        log.info("result: {}", JSON.toJSONString(execute, Boolean.TRUE));
    }

}
