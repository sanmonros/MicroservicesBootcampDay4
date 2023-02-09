package com.nttdata.observable;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class App {

	public static void main(String[] args) {
		
		//Primera parte
		Observable<String> observer = Observable.just("Hello", "World", "!");
        //observable.subscribe(message -> System.out.println("Observed message: " + message));
        
        //Segunda parte
        Observer<String> firstObserver = new Observer<String>() {
            @Override
            public void onNext(String message) {
                System.out.println("First observer received message: " + message);
            }

            @Override
            public void onError(Throwable e) {}

            @Override
            public void onComplete() {}

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Suscrito");
				
			}
        };

        Observer<String> secondObserver = new Observer<String>() {
            @Override
            public void onNext(String message) {
                System.out.println("Second observer received message: " + message);
            }

            @Override
            public void onError(Throwable e) {}

            @Override
            public void onComplete() {}

			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Suscrito");
				
			}
        };

        observer.subscribe(firstObserver);
        observer.subscribe(secondObserver);
        
	      
           
	}

}
