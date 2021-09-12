package flink.examples.datastream._01.bytedance.split.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ClientLogSink {
    private int id;
    private int price;
    private long timestamp;

}
