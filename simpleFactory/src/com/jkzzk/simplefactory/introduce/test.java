package com.jkzzk.simplefactory.introduce;

import com.jkzzk.simplefactory.factory.JavaVideo;
import com.jkzzk.simplefactory.factory.PhpVideo;
import com.jkzzk.simplefactory.factory.Video;
import com.jkzzk.simplefactory.factory.VideoFactory;

import java.util.Optional;

public class test {
    /*
    *   简单工厂模式
    *       有一个工厂对象决定创建出哪一种产品类的实例
    *
    *       传入一个参数，就可以获取你所需要的产品实例
    * */
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();

        // 简单工厂方法
        Optional.of(videoFactory.getSimpleVideo("java")).ifPresentOrElse(video->{
            video.getProduct(); //javaVideo生产过程！
        },() -> {
            System.out.println("简单工厂方法失败");
        });

        // 工厂方法
        Optional.of(videoFactory.getVideo(PhpVideo.class)).ifPresentOrElse(video->{
            video.getProduct(); // phpVideo生产过程！
        },() -> {
            System.out.println("工厂方法失败");
        });
    }
}
