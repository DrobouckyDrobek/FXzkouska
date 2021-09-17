module com.example.fxtestik {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.fxtestik to javafx.fxml;
    exports com.example.fxtestik;
}