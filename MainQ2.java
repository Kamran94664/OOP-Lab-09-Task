interface Course {
    void playVideo();
    void startSession();
}

class RecordedCourse implements Course {
    @Override
    public void playVideo() {
        System.out.println("Playing recorded video...");
    }
    @Override
    public void startSession() {
        System.out.println("Access course anytime.");
    }
}

class LiveCourse implements Course {
    @Override
    public void playVideo() {
        System.out.println("Streaming live session...");
    }
    @Override
    public void startSession() {
        System.out.println("Joining live class at scheduled time.");
    }
}

class HybridCourse implements Course {
    RecordedCourse recorded = new RecordedCourse();
    LiveCourse live = new LiveCourse();
    @Override
    public void playVideo() {
        recorded.playVideo();
        live.playVideo();
    }

    @Override
    public void startSession() {
        System.out.println("Hybrid course session:");
        live.startSession();
        recorded.startSession();
    }
}
public class MainQ2 {
    public static void main(String[] args) {
        Course course = new HybridCourse();
        course.startSession();
        course.playVideo();
    }
}