import 'package:flutter/material.dart';
import 'package:newsfontend/logic/RestartAppWidget.dart';
import 'package:newsfontend/ui/Homepage.dart';

void main(){
  runApp(
    Restartappwidegt(child: Main())
    
  );
}

class Main extends StatelessWidget {
  const Main({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Homepage(),
      debugShowCheckedModeBanner: false,

    );
  }
}