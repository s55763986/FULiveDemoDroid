package com.faceunity;


import com.faceunity.entity.Effect;
import com.faceunity.entity.LightMakeupItem;
import com.faceunity.entity.MakeupEntity;

import java.util.List;
import java.util.Map;

/**
 * FURenderer 与界面之间的交互接口
 // TODO: 2020/9/21 0021 违反接口隔离原则，实在太臃肿了，给点时间重构吧
 */
public interface OnFUControlListener {
    /**
     * 美颜效果全局开关
     *
     * @param isOn
     */
    void setBeautificationOn(boolean isOn);

    /**
     * 音乐滤镜时间
     *
     * @param time
     */
    void onMusicFilterTime(long time);

    /**
     * 选择道具贴纸
     *
     * @param effect
     */
    void onEffectSelected(Effect effect);

    /**
     * 美颜滤镜名称
     *
     * @param name
     */
    void onFilterNameSelected(String name);

    /**
     * 美颜滤镜强度
     *
     * @param level
     */
    void onFilterLevelSelected(float level);

    /**
     * 美发颜色
     *
     * @param type
     * @param index
     * @param strength
     */
    void onHairSelected(int type, int index, float strength);

    /**
     * 美发强度
     *
     * @param index
     * @param strength
     */
    void onHairStrengthSelected(int index, float strength);

    /**
     * 磨皮类型
     *
     * @param type 0 清晰磨皮，1 重度磨皮，2 精细磨皮
     */
    void onBlurTypeSelected(float type);

    /**
     * 磨皮程度
     *
     * @param level 磨皮程度 [0, 6]，默认 6.0
     */
    void onBlurLevelSelected(float level);

    /**
     * 锐化程度
     *
     * @param level 锐化程度 [0, 1]，默认 0.0
     */
    void onSharpenLevelSelected(float level);

    /**
     * 美白
     *
     * @param level
     */
    void onColorLevelSelected(float level);

    /**
     * 红润
     *
     * @param level
     */
    void onRedLevelSelected(float level);

    /**
     * 亮眼
     *
     * @param level
     */
    void onEyeBrightSelected(float level);

    /**
     * 美牙
     *
     * @param level
     */
    void onToothWhitenSelected(float level);

    /**
     * 大眼
     *
     * @param level
     */
    void onEyeEnlargeSelected(float level);

    /**
     * 瘦脸
     *
     * @param level
     */
    void onCheekThinningSelected(float level);

    /**
     * 下巴
     *
     * @param level
     */
    void onIntensityChinSelected(float level);

    /**
     * 额头
     *
     * @param level
     */
    void onIntensityForeheadSelected(float level);

    /**
     * 瘦鼻
     *
     * @param level
     */
    void onIntensityNoseSelected(float level);

    /**
     * 嘴形
     *
     * @param level
     */
    void onIntensityMouthSelected(float level);

    /**
     * 窄脸
     *
     * @param level
     */
    void onCheekNarrowSelected(float level);

    /**
     * 小脸
     *
     * @param level
     */
    void onCheekSmallSelected(float level);

    /**
     * V脸
     *
     * @param level
     */
    void onCheekVSelected(float level);

    /**
     * 颧骨
     *
     * @param intensity
     */
    void setCheekbonesIntensity(float intensity);

    /**
     * 下颌骨
     *
     * @param intensity
     */
    void setLowerJawIntensity(float intensity);

    /**
     * 切换海报模板
     *
     * @param tempWidth
     * @param tempHeight
     * @param temp
     * @param landmark
     */
    void onPosterTemplateSelected(int tempWidth, int tempHeight, byte[] temp, float[] landmark);

    /**
     * 海报换脸输入照片
     *
     * @param inputWidth
     * @param inputHeight
     * @param input
     * @param landmark
     */
    void onPosterInputPhoto(int inputWidth, int inputHeight, byte[] input, float[] landmark);

    /**
     * 设置风格滤镜
     *
     * @param style
     */
    void setCartoonFilter(int style);

    /**
     * 调节多个轻美妆的妆容
     *
     * @param makeupItems
     */
    void onLightMakeupCombinationSelected(List<LightMakeupItem> makeupItems);

    /**
     * 轻美妆妆容调节强度
     *
     * @param makeupItem
     */
    void onLightMakeupItemLevelChanged(LightMakeupItem makeupItem);

    /**
     * 设置美妆组合妆容
     *
     * @param makeupEntity
     * @param paramMap
     */
    void selectMakeup(MakeupEntity makeupEntity, Map<String, Object> paramMap);

    /**
     * 设置美妆妆容参数
     *
     * @param paramMap
     */
    void setMakeupItemParam(Map<String, Object> paramMap);

    /**
     * 调节美妆妆容强度
     *
     * @param name
     * @param density
     */
    void setMakeupItemIntensity(String name, double density);

    /**
     * 设置美妆妆容颜色
     *
     * @param name
     * @param colors RGBA color
     */
    void setMakeupItemColor(String name, double[] colors);

    /**
     * 设置瘦身程度
     *
     * @param intensity
     */
    void setBodySlimIntensity(float intensity);

    /**
     * 设置长腿程度
     *
     * @param intensity
     */
    void setLegSlimIntensity(float intensity);

    /**
     * 设置细腰程度
     *
     * @param intensity
     */
    void setWaistSlimIntensity(float intensity);

    /**
     * 设置美肩程度
     *
     * @param intensity
     */
    void setShoulderSlimIntensity(float intensity);

    /**
     * 设置美臀程度
     *
     * @param intensity
     */
    void setHipSlimIntensity(float intensity);

    /**
     * 设置小头程度
     *
     * @param intensity
     */
    void setHeadSlimIntensity(float intensity);

    /**
     * 设置瘦腿程度
     *
     * @param intensity
     */
    void setLegThinSlimIntensity(float intensity);

    /**
     * 设置去黑眼圈强度
     *
     * @param strength
     */
    void setRemovePouchStrength(float strength);

    /**
     * 设置去法令纹强度
     *
     * @param strength
     */
    void setRemoveNasolabialFoldsStrength(float strength);

    /**
     * 设置微笑嘴角强度
     *
     * @param intensity
     */
    void setSmileIntensity(float intensity);

    /**
     * 设置开眼角强度
     *
     * @param intensity
     */
    void setCanthusIntensity(float intensity);

    /**
     * 设置人中长度
     *
     * @param intensity
     */
    void setPhiltrumIntensity(float intensity);

    /**
     * 设置鼻子长度
     *
     * @param intensity
     */
    void setLongNoseIntensity(float intensity);

    /**
     * 设置眼睛间距
     *
     * @param intensity
     */
    void setEyeSpaceIntensity(float intensity);

    /**
     * 设置眼睛角度
     *
     * @param intensity
     */
    void setEyeRotateIntensity(float intensity);

    /**
     * 绿幕扣像。(0~255, 0~255, 0~255)	需要抠除的颜色RGB值
     *
     * @param rgb
     */
    void setKeyColor(double[] rgb);

    /**
     * 绿幕扣像。0.0~1.0			色度最大容差，值越大，更多幕景被抠除，默认为0.0(真实对应范围0.23-1)
     *
     * @param intensity
     */
    void setChromaThres(float intensity);

    /**
     * 绿幕扣像。0.0~1.0			色度最小限差，值越大，更多幕景被扣除，默认为0.0(真实对应范围0~0.23）
     *
     * @param intensity
     */
    void setChromaThresT(float intensity);

    /**
     * 绿幕扣像。0.0~1.0			图像前后景透明度过度，值越大，两者边缘处透明过度更平滑，默认为0.0
     *
     * @param intensity
     */
    void setAlphaL(float intensity);

    /**
     * 绿幕抠像。背景视频路径，用于解码
     *
     * @param filePath
     */
    void setTexBgSource(String filePath);

    /**
     * 表示绿幕渲染框起点和终点的像素坐标，范围为 0.0-1.0 通过外部传进来，来决定位置。
     *
     * @param startX
     * @param startY
     * @param endX
     * @param endY
     */
    void setTransform(float startX, float startY, float endX, float endY);

    /**
     * 是否开启绿幕抠像
     *
     * @param run
     */
    void setRunBgSegGreen(boolean run);

}
