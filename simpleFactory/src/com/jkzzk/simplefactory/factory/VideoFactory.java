package com.jkzzk.simplefactory.factory;

public class VideoFactory {
    // 工厂方法
    public Video getVideo(Class c) {
        Video video = null;

        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;
    }

    // 简单工厂方法
    public Video getSimpleVideo(String videoName) {
        if("java".equalsIgnoreCase(videoName)) {
            return new JavaVideo();
        }else if("php".equalsIgnoreCase(videoName)) {
            return new PhpVideo();
        }

        return null;
    }
}
