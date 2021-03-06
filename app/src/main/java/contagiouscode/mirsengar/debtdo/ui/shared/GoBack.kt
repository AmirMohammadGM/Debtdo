package contagiouscode.mirsengar.debtdo.ui.shared

import android.app.Activity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import contagiouscode.mirsengar.debtdo.R

@Composable
fun GoBack(activity : Activity) {
     Row(modifier = Modifier
               .fillMaxWidth()
               .clickable {
                    activity.finish()
               }
               .padding(top = 20.dp , start = 20.dp , end = 20.dp , bottom = 20.dp)
     ) {
          Icon(
                    painter = painterResource(R.drawable.ic_icon_arrow_left) , "Go back" ,
                    tint = MaterialTheme.colors.primary ,
                    modifier = Modifier
                              .padding(end = 20.dp)
                              .align(Alignment.CenterVertically)
          )
          Text(
                    "Go back" , color = MaterialTheme.colors.onBackground ,
                    style = MaterialTheme.typography.h3 ,
          )
     }
}