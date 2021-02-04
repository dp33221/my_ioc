package service;

import annotation.MyAutowired;
import annotation.MyService;
import annotation.MyTransactional;
import mapper.PaymentChannelMapper;
import pojo.PaymentChannel;

/**
 * @author dingpei
 * @Description: todo
 * @date 2020/11/30 10:41 下午
 */
@MyService
public class MySimpleSpringServiceJdk implements IMySimpleSpringService {
    @MyAutowired
    private PaymentChannelMapper paymentChannelMapper;

    @MyTransactional
    @Override
    public void test() {
//        final PaymentChannelMapper paymentChannelMapper = new DefaultBeanFactory().getBean("paymentChannelMapper");
//        final List<PaymentChannel> paymentChannels = paymentChannelMapper.selectAll();
//        for (PaymentChannel paymentChannel : paymentChannels) {
//            System.out.println(paymentChannel);
//        }
        paymentChannelMapper.insert(PaymentChannel.builder().id(999).channel_name("测试测试回滚").channel_status(0).build());
//        int i=1/0;
//        paymentChannelMapper.selectAll();


    }
}
