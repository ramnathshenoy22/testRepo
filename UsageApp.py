
import numpy as np
import matplotlib.pyplot as plt
import matplotlib.pyplot as pl
import pylab as pl
from sklearn import svm

train_data=np.genfromtxt("/Users/rashenoy/Documents/UsageData.csv",delimiter=",")

IonStandard_train_data=np.genfromtxt("/Users/rashenoy/Documents/IonStandardUsage.csv",delimiter=",")

#trainingdata of usage
X=train_data[:,0:1]

X_i=IonStandard_train_data[1:,0:1]
#resultant training y data
y=train_data[:,1]

y_i=IonStandard_train_data[1:,1]

clf = svm.SVR(kernel='rbf', C=1e3, gamma=0.1);
clf.fit(X, y)  ;
clf_i = svm.SVR(kernel='rbf', C=1e3, gamma=0.1);
clf_i.fit(X_i, y_i)  ;

#month_name = raw_input('Enter the month of the year: ')
y_predict=(clf.predict(X))
print y_predict

y_i_predict=(clf_i.predict(X))
print y_i_predict

val = 700. # this is the value where you want the data to appear on the y-axis.
ar = np.arange(10) # just as an example array


#ax1.plot(ar, np.zeros_like(ar) + val, '--')
# ax1.plot(X,y_predict,c='r',label='Usage Vs Time')

# ax.set_xlabel('common xlabel')
# ax.set_ylabel('common ylabel')

# ax2 = f2.add_subplot(111)
# ax2.plot(X,y_i_predict,c='r',label='IonStandard Usage (Among all users)')
# plt.show()


plt.plot(ar, np.zeros_like(ar) + val, '--')

plt.plot(X,y_predict,c='r',label='Usage Vs Time (Users Perspective)')
plt.hold('on')
plt.xlabel('Time (Months)')
plt.ylabel('Usage (in TB)')
plt.title('Usage Trends')
plt.legend()
plt.show()

plt.plot(X,y_i_predict,c='b',label='IonStandard Usage (Among all users)')

#plt.scatter(X,y_predict, c='g', label='Predicted Usage Graph')
plt.hold('on')
plt.xlabel('Time (Months)')
plt.ylabel('Usage (in TB)')
plt.title('Ion Standard Usage Trends')
plt.legend()
plt.show()

