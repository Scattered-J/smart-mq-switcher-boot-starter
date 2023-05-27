package em;

/**
 * @Author: HuZeXuan
 * @Date: 2023/04/05/21:18
 */
public enum MqTypeEnum {
    /**
     * mq类型枚举
     */
    Rabbit("rabbit", ""),
    Rocket("rocket", "");

    private String type;

    private String desc;

    MqTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
